package jp.ac.it_college.std.s23024.myslideshow.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jp.ac.it_college.std.s23024.myslideshow.R

val resources = listOf(
    R.drawable.slide00, R.drawable.slide01, R.drawable.slide02,
    R.drawable.slide03, R.drawable.slide04, R.drawable.slide05,
    R.drawable.slide06, R.drawable.slide07, R.drawable.slide08,
    R.drawable.slide09
)

@Composable
fun Slideshow(
    modifier: Modifier = Modifier
) {
    val pagerState = rememberPagerState(pageCount = { resources.size })
Scaffold(
    topBar = { TopBar() },
    bottomBar = { BottomBar(pagerState = pagerState) },
) { innerPadding ->
    VerticalPager(
        state = pagerState,
        modifier = Modifier.padding(innerPadding)
    ) { page ->
        PagerItem(
            imageRes = resources[page],
            modifier = Modifier.fillMaxSize()
        )
    }
}
}

@Preview
@Composable
fun SlideshowPreview() {
    Slideshow()
}