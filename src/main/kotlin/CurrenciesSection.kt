package org.example

import org.example.data.Currency
import java.lang.reflect.Modifier

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
    ),
)
@Preview
@Composable
fun CurrenciesSection() {
    var isVisible by remember { mutableStateOf(false) }
    var iconState by remember { mutableStateOf(Icons.Rounded.KeyboardArrowUp) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 32.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column (
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(MaterialTheme.colorScheme.inverseOnSurface)
                .animateContentSize()
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .animateContentSize()
                    .fillMaxWith(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(MateriaTheme.colorScheme.secondary)
                        .clickable {
                            isVisable = !isVisible
                            iconState = if (isVisible)
                        }
                )
            }
        }
}
}