import 'package:home_widget/home_widget.dart';

Future<void> updateAppWidget() async {
  HomeWidget.saveWidgetData<String>('_srcText', 'Sample Data from Dart!1!1!1');
  HomeWidget.updateWidget(
    name: 'SampleAppWidget',
    androidName: 'SampleAppWidgetProvider',
    iOSName: 'SampleAppWidgetExtension',
  );
}
