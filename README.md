# Android_Common_Intents
Opening Web Page of given URL by ACTION_VIEW

# Code

#### 1st Activity 
```
//get the url form the user
String url = fetchURL.getText().toString();

//parse the url
Uri webpage = Uri.parse(url);

Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

//there must another intent to handle else your app can be crashed 
if (intent.resolveActivity(getPackageManager()) != null)
    startActivity(intent);
```

# App Highlight

<img src="app_images/Open Webpage Code.png" width="1000" /><br>

<img src="app_images/Open Webpage App.png" width="300" /><br>
