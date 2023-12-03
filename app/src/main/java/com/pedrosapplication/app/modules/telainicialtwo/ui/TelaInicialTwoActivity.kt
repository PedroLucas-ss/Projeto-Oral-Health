package com.pedrosapplication.app.modules.telainicialtwo.ui

import androidx.activity.viewModels
import com.pedrosapplication.app.R
import com.pedrosapplication.app.appcomponents.base.BaseActivity
import com.pedrosapplication.app.databinding.ActivityTelaInicialTwoBinding
import com.pedrosapplication.app.modules.telacadastrodr.ui.TelaCadastroDrActivity
import com.pedrosapplication.app.modules.telainicialtwo.`data`.viewmodel.TelaInicialTwoVM
import com.pedrosapplication.app.modules.telalogindr.ui.TelaLoginDrActivity
import kotlin.String
import kotlin.Unit

class TelaInicialTwoActivity :
    BaseActivity<ActivityTelaInicialTwoBinding>(R.layout.activity_tela_inicial_two) {
  private val viewModel: TelaInicialTwoVM by viewModels<TelaInicialTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.telaInicialTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnEntrar.setOnClickListener {
      val destIntent = TelaLoginDrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCadastrar.setOnClickListener {
      val destIntent = TelaCadastroDrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TELA_INICIAL_TWO_ACTIVITY"

  }
}
