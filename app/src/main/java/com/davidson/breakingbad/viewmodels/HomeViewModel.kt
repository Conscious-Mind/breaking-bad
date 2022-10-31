package com.davidson.breakingbad.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.davidson.breakingbad.repository.BreakingBadRepository
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val breakingBadRepo = BreakingBadRepository()

    val breakingBadCharacterList =breakingBadRepo.characters

    init {
        viewModelScope.launch {
            breakingBadRepo.getCharactersFromNetwork()
        }
    }
}