plugins {
    id("org.gradlex.build-parameters") version "1.0"
}

// tag::grouping[]
buildParameters {
    group("myGroup") {
        string("myString") { }
        integer("myInt") { }
    }
}
// end::grouping[]