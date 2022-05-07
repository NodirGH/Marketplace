package com.example.marketplace.onboarding

enum class OnBoardingType {
    Diversity, BaseHall, Convenience;

    companion object {
        fun getTypeByPosition(position: Int): OnBoardingType {
            return when (position) {
                0 -> Diversity
                1 -> BaseHall
                2 -> Convenience
                else -> Diversity
            }
        }
    }
}