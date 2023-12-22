package com.jetpackcompose.sample.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcompose.sample.R

@Preview(heightDp = 300)
@Composable
fun previewItem() {
    LazyColumn(content = {
        items(getCategoryList()){
            BlogCategory(img = it.img, title = it.title , subtitle =it.subtitle )
        }
    })
}



@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {
    Card(
        modifier = Modifier
            .shadow(8.dp, RoundedCornerShape(5.dp))
            .padding(10.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img), contentDescription = "testing",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .clip(CircleShape)
                    .weight(2f)
            )



            itemDescription(title, subtitle, Modifier.weight(8f))

        }


    }
}

@Composable
public fun itemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 10.sp
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Bold,
            fontSize = 8.sp
        )
    }
}

data class Category(val img : Int, val title: String, val subtitle: String )

fun getCategoryList():MutableList<Category>{
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
    list.add(Category(R.drawable.ic_launcher_background, "tititle", "subtitle"))
return list

}
