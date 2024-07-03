package com.aristidevs.paging3tutorial.presentation

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.aristidevs.paging3tutorial.data.RickRepository
import com.aristidevs.paging3tutorial.presentation.model.CharacterModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class RickListViewModel @Inject constructor(rickRepository: RickRepository) : ViewModel() {

    val characters: Flow<PagingData<CharacterModel>> = rickRepository.getAllCharacters()

}