# Auth
Auth with firebase using defalt ui and sdk

<h1>SETUP</h1>
<ol>
  <li>
    <i>Add the INTERNET permission to your manifest file.</i>
    <uses-permission android:name="android.permission.INTERNET" />
  </li>
  
  <li>
    <i>add libraries</i>

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  dependencies {
	        implementation 'com.github.myThic-cosmos:Auth:0.6.1.20'
	}
  </li>
  
  <li>
    <i>connect firebase in your project</i>
    Sign in your gmail in android studio (button available in top right corner)
    Then follow the steps
    <b>Tools</b> -> <b>Firebase</b> -> <b>Analytics</b> -> <b>Log on analytics event</b> -> <b>Connect to firebase</b>
    After that give a name and finish setup
  </li>
  
  <li>
    go to https://console.firebase.google.com/
    click on your project
    then follow the steps
    <b>Develop</b> -> <b>Authentication</b> -> <b>Sign-in method</b>
    Enable which option you choose
    
    If you support sign-in with Facebook or Twitter, add string resources to strings.xml 
      <resources>
        <string name="facebook_application_id" translatable="false">YOUR_APP_ID</string>
        <string name="facebook_login_protocol_scheme" translatable="false">fbYOUR_APP_ID</string>
        <string name="twitter_consumer_key" translatable="false">YOUR_CONSUMER_KEY</string>
        <string name="twitter_consumer_secret" translatable="false">YOUR_CONSUMER_SECRET</string>
      </resources>
      
      replace your app id
      
      see this vedio https://www.youtube.com/watch?v=EO-_vwfVi7c&t=962s
      for how to find fb app id and secret
    </li>
    
    
    <li>
      
    </li>
