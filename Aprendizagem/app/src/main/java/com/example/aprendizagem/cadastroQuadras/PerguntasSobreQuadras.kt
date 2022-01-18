package com.example.aprendizagem.cadastroQuadras

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.aprendizagem.R
import com.example.aprendizagem.databinding.FragmentPerguntasSobreQuadrasBinding

class PerguntasSobreQuadras: Fragment (){

    private var binding: FragmentPerguntasSobreQuadrasBinding? = null
    // private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = FragmentPerguntasSobreQuadrasBinding.inflate(inflater, container, false)
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
            perguntasSobreQuadras = this@PerguntasSobreQuadras
        }
    }

 fun nextScreen(){
     findNavController().navigate(R.id.action_valorDasQuadras_to_variacaoDeHorarioFragment)
 }

}