package br.com.saradev.quizapp.model

import br.com.saradev.quizapp.R

data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val correctAnswer: Int
) {

    companion object {

        fun getQuestions() = listOf(
            Question(
                id = 1,
                question = "What country this flag belong to?",
                image = R.drawable.ic_flag_of_argentina,
                optionOne = "Armenia",
                optionTwo = "Australia",
                optionThree = "Argentina",
                correctAnswer = 3
            ),
            Question(
                id = 2,
                question = "What country this flag belong to?",
                image = R.drawable.ic_flag_of_australia,
                optionOne = "New Zeland",
                optionTwo = "Australia",
                optionThree = "England",
                correctAnswer = 2
            ),
            Question(
                id = 3,
                question = "What country this flag belong to?",
                image = R.drawable.ic_flag_of_brazil,
                optionOne = "Brazil",
                optionTwo = "Belarus",
                optionThree = "Brunei",
                correctAnswer = 1
            ),
            Question(
                id = 4,
                question = "What country this flag belong to?",
                image = R.drawable.ic_flag_of_belgium,
                optionOne = "Barbados",
                optionTwo = "Bahamas",
                optionThree = "Belgium",
                correctAnswer = 3
            ),
            Question(
                id = 5,
                question = "What country this flag belong to?",
                image = R.drawable.ic_flag_of_fiji,
                optionOne = "Fiji",
                optionTwo = "Finland",
                optionThree = "Gabon",
                correctAnswer = 1
            ),
            Question(
                id = 6,
                question = "What country this flag belong to?",
                image = R.drawable.ic_flag_of_denmark,
                optionOne = "Egypt",
                optionTwo = "Ethiopia",
                optionThree = "Denmark",
                correctAnswer = 3
            ),
            Question(
                id = 7,
                question = "What country this flag belong to?",
                image = R.drawable.ic_flag_of_india,
                optionOne = "Hungary",
                optionTwo = "India",
                optionThree = "Iran",
                correctAnswer = 2
            ),
            Question(
                id = 8,
                question = "What country this flag belong to?",
                image = R.drawable.ic_flag_of_new_zealand,
                optionOne = "Australia",
                optionTwo = "Tuvalu",
                optionThree = "New Zealand",
                correctAnswer = 3
            ),
            Question(
                id = 9,
                question = "What country this flag belong to?",
                image = R.drawable.ic_flag_of_kuwait,
                optionOne = "Kuwait",
                optionTwo = "Jordan",
                optionThree = "Sudan",
                correctAnswer = 1
            ),
            Question(
                id = 10,
                question = "What country this flag belong to?",
                image = R.drawable.ic_flag_of_germany,
                optionOne = "Georgia",
                optionTwo = "Belgium",
                optionThree = "Germany",
                correctAnswer = 1
            )
        )
    }
}