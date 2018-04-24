Redescribing Katalon Studio --- Parameterizing Test Object
====

## What is this?

This is a simple [Katalon Studio](https://www.katalon.com/) project for demonstration purpose. You can check this out onto your PC and execute it with your Katalon Studio.

This will give you a successfully running example of [`com.kms.katalon.core.testobject.ObjectRepository#findTestObject(String, Map)`](https://api-docs.katalon.com/studio/v4.7.0/api/com/kms/katalon/core/testobject/ObjectRepository.html#findTestObject) method call. This enables your Test Case update the locator of a Test Object dynamically. The official document ["Parameterized a Test Object"](https://docs.katalon.com/display/KD/Parameterized+a+Test+Object) covers this approach.

Why I developped this? The 1st reason was that I wanted to respond to a post in the Katalon Forum (https://forum.katalon.com/discussion/comment/14291) with a runnable example. The 2nd reason was that I found [the official document](https://docs.katalon.com/display/KD/Parameterized+a+Test+Object) is not descriptive enough. I was uncertain, without hands-on experience, if it really works. I spent a few hours for coding and could make this demo project.

I found that "Parameterized a Test Object" approach actually works but is a bit  difficult to understand.
