
apply { plugin("kotlin") }

dependencies {
    compile(project(":idea"))
    compile(project(":compiler:light-classes"))
    compile(project(":compiler:frontend.java"))
    compileOnly(intellijDep()) { includeJars("openapi", "idea", "extensions", "util") }

    compileOnly(intellijPluginDep("junit")) { includeJars("idea-junit") }
    compileOnly(intellijPluginDep("testng")) { includeJars("testng", "testng-plugin") }
    compileOnly(intellijPluginDep("coverage")) { includeJars("coverage") }
    compileOnly(intellijPluginDep("java-decompiler")) { includeJars("java-decompiler") }
}


sourceSets {
    "main" { projectDefault() }
    "test" { none() }
}
