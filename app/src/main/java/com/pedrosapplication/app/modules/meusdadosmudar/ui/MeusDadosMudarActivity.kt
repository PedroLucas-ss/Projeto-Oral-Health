package com.pedrosapplication.app.modules.meusdadosmudar.ui

import androidx.activity.viewModels
import com.pedrosapplication.app.R
import com.pedrosapplication.app.appcomponents.base.BaseActivity
import com.pedrosapplication.app.databinding.ActivityMeusDadosMudarBinding
import com.pedrosapplication.app.modules.meusdadosmudar.`data`.viewmodel.MeusDadosMudarVM
import kotlin.String
import kotlin.Unit

class MeusDadosMudarActivity :
    BaseActivity<ActivityMeusDadosMudarBinding>(R.layout.activity_meus_dados_mudar) {
  private val viewModel: MeusDadosMudarVM by viewModels<MeusDadosMudarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.meusDadosMudarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MEUS_DADOS_MUDAR_ACTIVITY"

  }
}
