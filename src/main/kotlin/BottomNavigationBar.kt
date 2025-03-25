package org.example

import com.sun.rowset.internal.Row
import org.example.data.BottomNavigation
import org.w3c.dom.Text
import java.lang.reflect.Modifier
import java.math.RoundingMode
import javax.swing.Icon
import javax.swing.ImageIcon

val items= listOf(
    BottomNavigation(
        title = "Home",
        icon = Icons.Rounded.Home
    ),
    BottomNavigation(
        title = "Wallet",
        icon = Icons.Rounded.Wallet
    ),
    BottomNavigation(
        title = "Notifications",
        icon = Icons.Rounded.Notifications
    ),
    BottomNavigation(
        title = "Account",
        icon = Icons.Rounded.AccountCircle
    )
)

/*
Row() {
items.forEachIndexed{ index, item ->
NavigationBarItem(
selected = index == 0,
onClick = {
icon = {
Icon(
imageVector = item.icon,
contentDescription  item.title,
tint = MaterialTheme.colorScheme.onBackground
)
}
)
}
}
}
 */

