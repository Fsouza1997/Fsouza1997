package com.example.aprendizagem.navegacaoPincipal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aprendizagem.R
import com.example.aprendizagem.databinding.FragmentEsportesInscritosBinding
import com.example.aprendizagem.databinding.FragmentPrincipalBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [EsportesInscritosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EsportesInscritosFragment : Fragment() {

    private var binding: FragmentEsportesInscritosBinding? = null
    // private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentEsportesInscritosBinding.inflate(inflater, container, false)
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
            esporteInscritos = this@EsportesInscritosFragment
        }
    }
}