# FlaskView
A flask loading view.

### [More](https://github.com/samlss/FunnyViews)

<br/>


![gif1](https://github.com/samlss/FlaskView/blob/master/screenshots/screenshot1.gif)

<br/>

![gif2](https://github.com/samlss/FlaskView/blob/master/screenshots/screenshot2.gif)



------
### Usage

#### Gradle
- Add it in your app build.gradle at the end of repositories:
  ```java
  dependencies {
      implementation 'me.samlss:flaskview:1.0.0'
  }
  ```

#### Maven
```java
<dependency>
  <groupId>me.samlss</groupId>
  <artifactId>flaskview</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

#### In layout.xml

```java
 <me.samlss.view.FlaskView
          app:bubble_min_speed="1"
          app:bubble_max_speed="5"
          app:bubble_creation_interval="70"
          app:stroke_width="2dp"
          app:water_height_percent="0.8"
          app:bubble_color="#fffeaf"
          app:water_color="#2b7971"
          app:stroke_color="#b39696"
          app:bubble_max_number="50"
          app:bubble_min_radius="5"
          app:bubble_max_radius="10"
          android:layout_weight="1"
          android:layout_width="0dp"
          android:layout_height="match_parent" />
```

#### In code
```java
 flaskView.setBubbleColor(Color.parseColor("#fff36a")); //Set the color of all the bubbles
 flaskView.setStrokeColor(Color.parseColor("#b9a4a4")); //Set the stroke color of flask
 flaskView.setWaterColor(Color.parseColor("#3b537b")); //Set the water color
 flaskView.setStrokeWidth(10); //Set the flask stroke width in pixel
 flaskView.setBubbleCreationInterval(60); //Set the creation of the bubble interval in millis
 flaskView.setWaterHeightPercent(0.6f); //Set the water level to the percentage of the height of the flask, value is [0-1]

 flaskView.start(); //Start animation
 flaskView.stop(); //Stop animation
 flaskView.release(); //Release the flask view
```


#### attr

```java
    <declare-styleable name="FlaskView">
        <!--The stroke color of flask-->
        <attr name="stroke_color" format="color"></attr>

        <!--The water color-->
        <attr name="water_color" format="color"></attr>

        <!--The bubble color-->
        <attr name="bubble_color" format="color"></attr>

        <!--The max radius of the bubbles-->
        <attr name="bubble_max_radius" format="integer"></attr>

        <!--The min radius of the bubbles-->
        <attr name="bubble_min_radius" format="integer"></attr>

        <!--The max speed of the bubbles-->
        <attr name="bubble_max_speed" format="float"></attr>

        <!--The min speed of the bubbles-->
        <attr name="bubble_min_speed" format="float"></attr>

        <!--Number of bubbles that can coexist at the same time-->
        <attr name="bubble_max_number" format="integer"></attr>

        <!--The creation of the bubble interval in millis-->
        <attr name="bubble_creation_interval" format="integer"></attr>

        <!--The stoke width of the flask-->
        <attr name="stroke_width" format="dimension"></attr>

        <!--The water level to the percentage of the height of the flask-->
        <attr name="water_height_percent" format="float"></attr>
    </declare-styleable>
```

### Optimization
Use a fixed number of containers to recycle bubbles that are no longer in use. When need to create bubble, firstly get them from the recycled container. If there are bubbles in the recycled container, reuse the object, otherwise a new one will be created.[See the code](https://github.com/samlss/FlaskView/blob/master/flaskview/src/main/java/me/samlss/view/FlaskView.java)


### License

```java
Copyright 2018 samlss

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
