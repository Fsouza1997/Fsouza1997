package com.example.aprendizagem.cadastroQuadras

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.aprendizagem.R
import com.example.aprendizagem.databinding.FragmentVariacaoDeHorarioBinding
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat

class VariacaoDeHorarioFragment : Fragment() {

    private var binding: FragmentVariacaoDeHorarioBinding? = null
    // private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = FragmentVariacaoDeHorarioBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            // Specify the fragment as the lifecycle owner
            lifecycleOwner = viewLifecycleOwner

            // Assign the view model to a property in the binding class
            // viewModel = sharedViewModel

            // Assign the fragment
            variacaoHorario = this@VariacaoDeHorarioFragment
        }
    }


    fun nextScreen() {
        findNavController().navigate(R.id.action_variacaoDeHorarioFragment_to_valorDasQuadrasFragment)
    }

    fun horarios() {
        val picker =
            MaterialTimePicker.Builder()
                .setTimeFormat(TimeFormat.CLOCK_12H)
                .setHour(12)
                .setMinute(10)
                .setTheme(R.style.ThemeOverlay_MaterialComponents_MaterialCalendar)
                .setTitleText("Selecione O horári")
                .build()
    }

}