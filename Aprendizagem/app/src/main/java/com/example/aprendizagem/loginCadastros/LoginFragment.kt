package com.example.aprendizagem.loginCadastros

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.aprendizagem.databinding.FragmentLoginBinding

import com.google.android.gms.auth.api.signin.GoogleSignInClient

import com.google.firebase.auth.FirebaseAuth


class LoginFragment : Fragment() {
    private var binding: FragmentLoginBinding? = null
   // private val sharedViewModel: OrderViewModel by activityViewModels()
    private lateinit var auth: FirebaseAuth
    private lateinit var googleSignInClient: GoogleSignInClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()
    //    loginGoogle()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentLoginBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return  fragmentBinding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            // Specify the fragment as the lifecycle owner
            lifecycleOwner = viewLifecycleOwner

            // Assign the view model to a property in the binding class
           // viewModel = sharedViewModel

            // Assign the fragment
            loginFragment = this@LoginFragment
        }
    }

//    fun nextScreen(){
//        val mainActivity: MainActivity
//       mainActivity.signIn()
//    }
//
//    fun loginGoogle(){
//        // Configure Google Sign In
//        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//            .requestIdToken(DEFAULT_URL_CLIENT_GOOGLE)
//            .requestEmail()
//            .build()
//
//        googleSignInClient = GoogleSignIn.getClient(requireContext(), gso)
//    }
//
//     fun signIn() {
//        val signInIntent = this.googleSignInClient.signInIntent
//        startActivityForResult(signInIntent, loginsCons.RC_SIGN_IN)
//    }
//
//    override fun onStart() {
//        super.onStart()
//        // Check if user is signed in (non-null) and update UI accordingly.
//        val currentUser = auth.currentUser
//      //  updateUI(currentUser!!)
//    }
//
//    override fun onActivityResult( requestCode: Int, resultCode: Int, data: Intent ?)   {
//        super.onActivityResult(requestCode, resultCode, data)
//        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
//        if (requestCode == loginsCons.RC_SIGN_IN) {
//            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
//            try {
//                // Google Sign In was successful, authenticate with Firebase
//                val account = task.getResult(ApiException::class.java)!!
//                Log.d(ContentValues.TAG, "firebaseAuthWithGoogle:" + account.id)
//                firebaseAuthWithGoogle(account.idToken!!)
//            } catch (e: ApiException) {
//                // Google Sign In failed, update UI appropriately
//                Log.w(ContentValues.TAG, "Google sign in failed", e)
//            }
//        }
//    }
//
//    private fun firebaseAuthWithGoogle(idToken: String) {
//        val credential = GoogleAuthProvider.getCredential(idToken, null)
//        auth.signInWithCredential(credential)
//            .addOnCompleteListener(requireActivity()) { task ->
//                if (task.isSuccessful) {
//                    // Sign in success, update UI with the signed-in user's information
//                    Log.d(ContentValues.TAG, "signInWithCredential:success")
//                    val user = auth.currentUser
//                    updateUI(user!!)
//                } else {
//                    // If sign in fails, display a message to the user.
//                    Log.w(ContentValues.TAG, "signInWithCredential:failure", task.exception)
//                   // updateUI(null!!)
//                }
//            }
//    }
//
//    fun updateUI(user: FirebaseUser){
//        if (user != null ){
//            findNavController().navigate(R.id.action_loginFragment_to_cadastroDonoQuadraFragment)
//        }else {
//
//        }
//
//    }

}