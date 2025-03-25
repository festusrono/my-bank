package org.example

import org.example.data.Currency

val currencies = listOf(
    Currency(
        name = "USD",
        buy = 34.32f,
        sell = 32.32f,
        icon = Icons.Rounded.AttachMoney
    ),

    Currency(
        name = "EUR",
        buy = 33.32f,
        sell = 44.32f,
        icon = Icons.Rounded.Euro
    ),
    Currency(
        name = "USD",
        buy = 44.34f,
        sell = 44.88f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "EUR",
        buy = 33.32f,
        sell = 44.32f,
        icon = Icons.Rounded.Euro
    ),
    Currency(
        name = "YEN",
        buy = 43.92f,
        sell = 45.32f,
        icon = Icons.Rounded.CurrencyYen
    )
)