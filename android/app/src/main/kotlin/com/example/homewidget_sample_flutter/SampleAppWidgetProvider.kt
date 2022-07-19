package com.example.homewidget_sample_flutter

import android.appwidget.AppWidgetManager
import android.content.Context
import android.content.SharedPreferences
import android.net.Uri
import android.widget.RemoteViews
//import com.example.homewidget_sample_flutter.R.id.fab
import es.antonborri.home_widget.HomeWidgetBackgroundIntent
import es.antonborri.home_widget.HomeWidgetProvider

class SampleAppWidgetProvider : HomeWidgetProvider() {
    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray, widgetData: SharedPreferences) {
        appWidgetIds.forEach { widgetId ->
            var views = RemoteViews(context.packageName, R.layout.sample_widget_layout).apply {
                var srcText = widgetData.getString("_srcText", "")
                setTextViewText(R.id.sampText, srcText)

//                val backgroundIntent = HomeWidgetBackgroundIntent.getBroadcast(
//                        context,
//                        Uri.parse("homeWidgetExample://titleClicked")
//                )
//                setOnClickPendingIntent(R.id.fab, backgroundIntent)
            }
            appWidgetManager.updateAppWidget(widgetId, views)
        }
    }
}