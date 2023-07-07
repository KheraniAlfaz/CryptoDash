package com.example.cryptodash.domain.repository

import com.example.cryptodash.data.remote.dto.CoinDetailDto
import com.example.cryptodash.data.remote.dto.CoinDto
import com.example.cryptodash.domain.model.Coin

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}