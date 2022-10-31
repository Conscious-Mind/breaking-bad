package com.davidson.breakingbad.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.davidson.breakingbad.network.BBNetwork
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class BreakingBadRepository {

    private val _characters = MutableLiveData<String>()
    val characters: LiveData<String>
        get() = _characters


    init {

    }

    suspend fun getCharactersFromNetwork() {
        withContext(Dispatchers.IO) {
            try {
                val breakingBadCharactersFromNetwork =
                    BBNetwork.retrofitBreakingBadService.getAllCharactersFromNetwork()

                _characters.postValue(breakingBadCharactersFromNetwork)
            } catch (e: Exception) {
                Log.e("ERROR_REPO", (e.message ?: "ERROR IN REPO, Getting Character From Network"))
            }
        }


    }
}