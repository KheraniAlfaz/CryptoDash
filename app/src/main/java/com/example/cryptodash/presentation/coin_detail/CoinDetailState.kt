package com.example.cryptodash.presentation.coin_detail

import com.example.cryptodash.domain.model.Coin
import com.example.cryptodash.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
