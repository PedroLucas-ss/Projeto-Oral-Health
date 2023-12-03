package com.pedrosapplication.app.modules.telainicialtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pedrosapplication.app.modules.telainicialtwo.`data`.model.TelaInicialTwoModel
import org.koin.core.KoinComponent

class TelaInicialTwoVM : ViewModel(), KoinComponent {
  val telaInicialTwoModel: MutableLiveData<TelaInicialTwoModel> =
      MutableLiveData(TelaInicialTwoModel())

  var navArguments: Bundle? = null
}
