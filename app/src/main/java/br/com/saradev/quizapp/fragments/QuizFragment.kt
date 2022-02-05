package br.com.saradev.quizapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.saradev.quizapp.R
import br.com.saradev.quizapp.model.Question

class QuizFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_quiz, container, false)
        flags()
    }

    private fun flags() {
        val questionList = Question.getQuestions()
    }
}