package br.com.saradev.quizapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.saradev.quizapp.R
import br.com.saradev.quizapp.databinding.FragmentQuizBinding
import br.com.saradev.quizapp.model.Question

class QuizFragment : Fragment() {

    private var _binding: FragmentQuizBinding? = null
    private val binding: FragmentQuizBinding get() = _binding!!

    private val currentPosition = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentQuizBinding.inflate(inflater, container, false).apply {
        _binding = this
    }.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setQuestion()
        configureProgressBar()
    }

    private fun setQuestion() {
        val questionList = Question.getQuestions()
        val question: Question? = questionList[currentPosition - 1]

        binding.apply {
            tvQuestion.text = question!!.question
            ivFlag.setImageResource(question.image)

            optionOne.text = question.optionOne
            optionTwo.text = question.optionTwo
            optionThree.text = question.optionThree
            optionFour.text = question.optionFour
            optionFive.text = question.optionFive
        }
    }

    private fun configureProgressBar() {
        binding.apply {
            progressBar.progress = currentPosition
            tvProgress.text = "$currentPosition/${progressBar.max}"
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
