package com.faisal.project2

import androidx.lifecycle.ViewModel

class LoginViewModel:ViewModel() {
    var name: String = ""
    var password: String = ""

    fun checkName(): Boolean {
        return name == "faisal"
    }
    fun checkPassword(): Boolean {
        return  password.length>=5
    }
    fun assign(name:String,password:String){
        this.name = name
        this.password = password
    }

}