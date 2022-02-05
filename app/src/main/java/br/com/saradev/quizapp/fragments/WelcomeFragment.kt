package br.com.saradev.quizapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import br.com.saradev.quizapp.R
import br.com.saradev.quizapp.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null
    private val binding: FragmentWelcomeBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentWelcomeBinding.inflate(inflater, container, false).apply {
        _binding = this
        enterQuiz()
    }.root

    private fun enterQuiz() {

        binding.button.setOnClickListener {
            binding.run {
                if (txtFieldInputName.text.toString().isEmpty()) {
                    Toast.makeText(context, "Please enter your name", Toast.LENGTH_SHORT).show()
                } else {
                    findNavController().navigate(R.id.quizFragment)
                }
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}