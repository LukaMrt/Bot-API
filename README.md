# Bot-API

[![Total alerts](https://img.shields.io/lgtm/alerts/g/LukaMrt/Bot-API.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/LukaMrt/Bot-API/alerts/)
[![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/LukaMrt/Bot-API.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/LukaMrt/Bot-API/context:java)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/8bc795de275c4cf1adef7576de57aa2e)](https://www.codacy.com/manual/LukaMrt/Bot-API?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=LukaMrt/Bot-API&amp;utm_campaign=Badge_Grade)
[![Gitmoji](https://img.shields.io/badge/gitmoji-%20😜%20😍-FFDD67.svg?style=flat)](https://gitmoji.carloscuesta.me)
[![Release](https://jitpack.io/v/LukaMrt/Bot-API.svg)](https://jitpack.io/LukaMrt/Bot-API)

Bot-API is a basic API to make an abstract layer between the code of your domain and the API which you use (for example JDA if you are making a java discord bot).

## Getting Started

Here are the instructions to use this API in your personal projects :

### Prerequisites

Before anything, you need to create and set up your project.

### Add in dependencies

You have 3 ways to add the API in your project's dependencies :

#### Manually add

To add manually the API, go in the [releases page](https://github.com/LukaMrt/Bot-API/releases)
and choose your version (the last if you want to have the last changes). Then download the version's jar.
Now you can add the dependency in your IDE (``File/Project Structure/Libraries`` in Intellij IDEA).

#### Gradle

To add the dependency with gradle, you need to use jitpack.
So you need to go in your ``build.gradle`` file and add the following lines :

```groovy
repositories {
    maven {
        url 'https://jitpack.io'
    }
}

dependencies {
    implementation 'com.github.LukaMrt:Bot-API:VERSION_TAG'
}
```

To see available versions, please check the [releases page](https://github.com/LukaMrt/Bot-API/releases).\
For example, if you want to use the version ``V0.1.0``, you need to add this line :

```groovy
implementation 'com.github.LukaMrt:Bot-API:V0.1.0'
```

#### Maven

*Instructions incoming*

## Built With

*   [Gradle](https://gradle.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/LukaMrt/Bot-API/tags)

## Authors

*   **Luka Maret** - *initial work* - [Personal Github](https://github.com/LukaMrt)

See also the list of [contributors](https://github.com/LukaMrt/Bot-API/contributors) who participated in this project.
