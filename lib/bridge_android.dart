import 'package:home_widget/home_widget.dart';

import 'package:intl/intl.dart';

Future<void> updateAndroidAppWidget() async {
  HomeWidget.saveWidgetData<String>('_srcText', ' hogehoge');
  HomeWidget.updateWidget(
    name: 'SampleAppWidget',
    androidName: 'SampleAppWidgetProvider',
    iOSName: 'SampleAppWidgetExtension',
  );
}
