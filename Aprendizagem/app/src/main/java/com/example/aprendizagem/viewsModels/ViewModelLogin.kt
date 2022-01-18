package com.example.aprendizagem.viewsModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelLogin: ViewModel() {

    private val _email = MutableLiveData<String>()
    val email:LiveData<String> = _email

    private val _senha = MutableLiveData<String>()
    val senha: LiveData<String> =_senha

    fun setEmail(requeryEmail: String){
        _email.value = requeryEmail
    }

    fun setSenha(requerySenha: String){
        _senha.value = requerySenha
    }
}