package com.pedrosapplication.app.modules.carregamento.ui

import androidx.activity.viewModels
import com.pedrosapplication.app.R
import com.pedrosapplication.app.appcomponents.base.BaseActivity
import com.pedrosapplication.app.databinding.ActivityCarregamentoBinding
import com.pedrosapplication.app.modules.carregamento.`data`.viewmodel.CarregamentoVM
import kotlin.String
import kotlin.Unit

class CarregamentoActivity :
    BaseActivity<ActivityCarregamentoBinding>(R.layout.activity_carregamento) {
  private val viewModel: CarregamentoVM by viewModels<CarregamentoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.carregamentoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CARREGAMENTO_ACTIVITY"

  }
}
