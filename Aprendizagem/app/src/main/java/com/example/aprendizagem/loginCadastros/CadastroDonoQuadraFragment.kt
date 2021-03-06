package com.example.aprendizagem.loginCadastros

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.aprendizagem.R
import com.example.aprendizagem.databinding.FragmentCadastroBinding

class CadastroDonoQuadraFragment : Fragment() {

    private var binding: FragmentCadastroBinding? = null
    // private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentCadastroBinding.inflate(inflater, container, false)
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
            cadastroDonoFragment = this@CadastroDonoQuadraFragment
        }
    }

    fun nextScreen(){
        findNavController().navigate(R.id.action_cadastroDonoQuadraFragment_to_cadastroClienteFragment)
    }

}