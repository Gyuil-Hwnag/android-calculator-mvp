package com.nextstep.edu.domain

class CalculationExpression {
    fun split(inputValue: String?): List<String> {
        require(!inputValue.isNullOrBlank()) { "Input Value is Null Or Blank" }
        return inputValue.split(VALUE_DIVIDER)
    }

    fun validate(splitInputValue: List<String>) {
        splitInputValue.forEach {
            require(it.isNotBlank()) { "Input Value is Blank" }
        }
    }

    companion object {
        private const val VALUE_DIVIDER = " "
    }
}