
apply { plugin("kotlin") }

dependencies {
    compile(project(":compiler:util"))
    compile(project(":jps-plugin"))
    compile(project(":plugins:android-extensions-compiler"))
    compileOnly(intellijDep()) { includeJars("openapi", "jps-builders") }
    compileOnly(intellijPluginDep("android")) { includeJars("jps/android-jps-plugin") }
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}

