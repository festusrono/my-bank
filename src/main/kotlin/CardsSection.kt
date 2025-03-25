package org.example

import org.example.data.Card
import java.awt.Color

val cards = listOf(
    Card(
        cardType = "VISA",
        cardNumber = "23434 34 442343 3422",
        balance = 3412.322,
        color = getGradient(PurpleStart, PurpleEnd),
    ),

    Card(
        cardType = "MASTER CARD",
        cardNumber = "2334 3432 3434 23",
        cardName = "Savings",
        balance = 53234.434,
        color = getGradient(BlueStart, BlueEnd),
    ),
    Card(
        cardType = "VISA",
        cardNumber = "2323 232 23323 32323",
        cardName = "School",
        balance = 32132.23,
        color = getGradient(OrangeStart, OrangeEnd),
    ),
    Card(
        cardType = "MASTER CARD",
        cardNumber = "3234 3434 43432 3432",
        cardName = "Trips",
        balance = 23343.4343,
        color = getGradient(GreenStart, GreenEnd)
    ),

)

fun getGradient(
    startColor: Color,
    endColor: Color,
): Brush {
    return Brush.horizontalGradient(
        colors = listOf(startColor, endColor)
    )
}

@Preview
@Composable
fun CardSection() {
    LazyRow {
        items(
            cards.size) { index ->
                CardItem(index)
        }
    }
}

@Composable
fun CardItem(
    index: Int
) {
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp
    id (index == cards.size -1) {
        lastItemPaddingEnd = 16.dp
    }

    var image = painterResource(id = R.drawable.ic_visa)
    if (card.cardType == "MASTER CARD") {
        image = painterResource(id = R.drawable.ic_mastercard)
    }

}