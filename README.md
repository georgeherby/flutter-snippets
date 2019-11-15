# Flutter Snippets

![JetBrains IntelliJ plugins](https://img.shields.io/jetbrains/plugin/d/12348-flutter-snippets.svg?style=plastic)

![](images/flutter_snippets.png)

An Intellij & Android Studio plugin that adds Live Templates to your IDE saving time writing the boilerplate in Flutter.

## Available Snippets
### Generic
| Shortcut|Expanded|Description|Flutter Docs| 
| ---------- | ----------| -------------- | -------------- |
|`alertDialog`| |Creates a showDialog that returns with AlertDialog|[View Docs](https://docs.flutter.io/flutter/widgets/AlertDialog-class.html)|
|`animatedBldr`|Animated Builder|Creates an Animated Builder. The child widget  is passed to the builder|[View Docs](https://docs.flutter.io/flutter/widgets/AnimationBuilder-class.html)|
|`aspectRatio`| |Creates an AspectRatio|[View Docs](https://api.flutter.dev/flutter/widgets/AspectRatio-class.html)|
|`column`| |Creates a Column Widget|[View Docs](https://docs.flutter.io/flutter/widgets/Column-class.html)|
|`container`| |Creates a Container Widget|[View Docs](https://docs.flutter.io/flutter/widgets/Container-class.html)|
|`customClipper`|Custom Clipper|Used for creating custom shapes|[View Docs](https://api.flutter.dev/flutter/rendering/CustomClipper-class.html)|
|`customPainter`|Custom Painter|Used for creating custom paint|[View Docs](https://api.flutter.dev/flutter/rendering/CustomPainter-class.html)|
|`customScrollV`| Custom ScrollView|Creates a ScrollView that creates custom scroll effects using slivers. If the primary argument is true, the controller must be null.|[View Docs](https://api.flutter.dev/flutter/widgets/CustomScrollView-class.html)|
|`dis`|Dispose|Called when this object is removed from the tree permanently. The framework calls this method when this State object will never build again.|[View Docs](https://api.flutter.dev/flutter/widgets/State/dispose.html)|
|`futureBldr`|Future Builder|Creates a Future Builder. This builds itself based on the latest snapshot of interaction with a Future|[View Docs](https://docs.flutter.io/flutter/widgets/FutureBuilder-class.html)|
|`initS`|InitState|Called when this object is inserted into the tree. The framework will call this method exactly once for each State object it creates.|[View Docs](https://api.flutter.dev/flutter/widgets/State/initState.html)|
|`layoutBldr`|Layout Builder|Similar to the Builder widget except that the framework calls the builder function at layout time and provides the parent widget's constraints.|[View Docs](https://api.flutter.dev/flutter/widgets/LayoutBuilder-class.html)|
|`listViewBldr`|ListView.Builder|Creates a scrollable, linear array of widgets that are created on demand.Providing a non-null itemCount improves the ability of the ListView to estimate the maximum scroll extent.|[View Docs](https://docs.flutter.io/flutter/widgets/ListView.builder.html)| 
|`orientationBldr`|Orientation Builder|Creates a builder which allows for the orientation of the device to be specified and referenced|[View Docs](https://api.flutter.dev/flutter/widgets/OrientationBuilder-class.html)|
|`row`| |Creates a Row Widget|[View Docs](https://docs.flutter.io/flutter/widgets/Row-class.html)|
|`singleChildSV`|Single Child Scroll View|Creates a scroll view with a single child|[View Docs](https://api.flutter.dev/flutter/widgets/SingleChildScrollView-class.html)|
|`streamBldr`| Stream Builder |Creates a new StreamBuilder that builds itself based on the latest snapshot of interaction with the specified stream |[View Docs](https://docs.flutter.io/flutter/widgets/StreamBuilder-class.html)|
|`statefulBldr`|Stateful Builder|Creates a widget that both has state and delegates its build to a callback. Useful for rebuilding specific sections of the widget tree.|[View Docs](https://api.flutter.dev/flutter/widgets/StatefulBuilder/StatefulBuilder.html)|
|`text`| |Creates a Text Widget|[View Docs](https://docs.flutter.io/flutter/widgets/Text-class.html)|

### Cupertino Specific
| Shortcut| Exapnded | Description| Flutter Docs |
| ---------- | ------------------------ | -------|------------- |
|`cupeApp`|Cupertino App |Create a New Cupertino App| [View Docs](https://api.flutter.dev/flutter/cupertino/CupertinoApp-class.html)|
|`importC`| Cupertino Package|Import Cupertino package.| [View Docs](https://api.flutter.dev/flutter/cupertino/cupertino-library.html)|
### Material Specific
| Shortcut| Expanded | Description| Flutter Docs |
| ---------- | ------------------------ | -------|------------- |
|`importM`| Material Package |Import Material package|[View Docs](https://api.flutter.dev/flutter/material/material-library.html)|
|`mateApp`| Material App |Create a new Material App|[View Docs](https://api.flutter.dev/flutter/material/MaterialApp-class.html) | 
|`scfAll`| Scaffold |Creates a Scaffold containing an Appbar, BottomNavigationBar and FloatingActionButton|[View Docs](https://docs.flutter.io/flutter/material/Scaffold-class.html)| 
|`scfAppBar`| Scaffold |Creates a Scaffold containing an Appbar| |
|`scfAppBarFab`| Scaffold |Creates a Scaffold containing an Appbar and Floating Action Button| |
|`scfAppBarBtmNav`| Scaffold |Creates a Scaffold containing an Appbar and Bottom Navigation Bar||


## Plugin Supports the Following IDEs:
* Android Studio
* IntelliJ IDEA Ultimate
* IntelliJ IDEA Community
* IntelliJ IDEA Educational

