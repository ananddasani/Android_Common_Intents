# Android_Common_Intents
Opening Web Page of given URL by ACTION_VIEW

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

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
![Open Webpage App](https://user-images.githubusercontent.com/74413402/192092982-6869cf7d-bf89-4391-b223-58328af64e42.png)
![Open Webpage Code](https://user-images.githubusercontent.com/74413402/192092979-3ff0256e-a1a5-4401-b197-6ea03724e96d.png)
