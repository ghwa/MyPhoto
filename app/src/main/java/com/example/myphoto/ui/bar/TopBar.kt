package com.example.myphoto.ui.bar

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.myphoto.R

/**
 *Created by jhcheng on 15/5/2022.
 */

@Composable
fun TopBar() {
    TopAppBar(
        elevation = 4.dp,
        title = {
            Text(text = stringResource(id = R.string.app_name))
        }
    )
}