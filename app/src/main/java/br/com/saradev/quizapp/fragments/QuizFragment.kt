package br.com.saradev.quizapp.fragments

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import br.com.saradev.quizapp.R
import br.com.saradev.quizapp.databinding.FragmentQuizBinding
import br.com.saradev.quizapp.model.Question
import br.com.saradev.quizapp.model.Question.Companion.getQuestions

class QuizFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentQuizBinding? = null
    private val binding: FragmentQuizBinding get() = _binding!!

    private var mCurrentPosition: Int = 1
    private var questionList: List<Question>? = null
    private var selectedOptionPosition: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentQuizBinding.inflate(inflater, container, false).apply {
        _binding = this
    }.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        questionList = getQuestions()

        setQuestion()
        configureProgressBar()
        setListeners()
    }

    private fun setListeners() {
        binding.optionOne.setOnClickListener(this)
        binding.optionTwo.setOnClickListener(this)
        binding.optionThree.setOnClickListener(this)
        binding.optionFour.setOnClickListener(this)
        binding.optionFive.setOnClickListener(this)
    }

    private fun setQuestion() {
        mCurrentPosition = 1
        val question = questionList!![mCurrentPosition - 1]

        defaultOptionsView()

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
            progressBar.progress = mCurrentPosition
            tvProgress.text = "$mCurrentPosition/${progressBar.max}"
        }
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()

        options.add(0, binding.optionOne)
        options.add(1, binding.optionTwo)
        options.add(2, binding.optionThree)
        options.add(3, binding.optionFour)
        options.add(4, binding.optionFive)

        for (option in options) {
            option.setTextColor(Color.parseColor("#333333"))
            option.typeface = Typeface.DEFAULT
            option.background = context?.let { ContextCompat.getDrawable(it, R.drawable.default_option_border) }
        }
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.optionOne -> {
                selectedOptionView(binding.optionOne, 1)
            }
            R.id.optionTwo -> {
                selectedOptionView(binding.optionTwo, 2)
            }
            R.id.optionThree -> {
                selectedOptionView(binding.optionThree, 3)
            }
            R.id.optionFour -> {
                selectedOptionView(binding.optionFour, 4)
            }
            R.id.optionFive -> {
                selectedOptionView(binding.optionFive, 5)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOption: Int) {
        defaultOptionsView()
        selectedOptionPosition = selectedOption

        tv.setTextColor(Color.parseColor("#243BB8"))
        tv.typeface = Typeface.DEFAULT_BOLD
        tv.background = context?.let { ContextCompat.getDrawable(it, R.drawable.selected_option_border) }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
