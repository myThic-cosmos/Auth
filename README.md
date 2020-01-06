# Auth
Auth with firebase using defalt ui and sdk

<h1>SETUP</h1>

<p><strong>Step 1.</strong> Add it in your root build.gradle at the end of repositories</p>
<pre><code>allprojects 
{
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
</code></pre>


<p><strong>Step 2.</strong> Add the dependency in your apps module build.gradle</p>
<pre><code>dependencies 
{
	  implementation 'com.github.myThic-cosmos:Auth:0.6.1.20'
}
</code></pre>


<p><strong>Step 3.</strong> Add the INTERNET permission to your manifest file</p>
<pre><code>  uses-permission android:name="android.permission.INTERNET"</code></pre>
