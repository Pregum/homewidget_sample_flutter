package com.example.homewidget_sample_flutter

import android.appwidget.AppWidgetManager
import android.content.Context
import android.content.SharedPreferences
import android.widget.RemoteViews
import es.antonborri.home_widget.HomeWidgetProvider

class SampleAppWidgetProvider : HomeWidgetProvider() {
    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray, widgetData: SharedPreferences) {
        appWidgetIds.forEach { widgetId ->
            var views = RemoteViews(context.packageName, R.layout.sample_widget_layout).apply {
                var srcText = widgetData.getString("_srcText", "")
                setTextViewText(R.id.sampText, srcText)
            }
            appWidgetManager.updateAppWidget(widgetId, views)
        }
    }

}