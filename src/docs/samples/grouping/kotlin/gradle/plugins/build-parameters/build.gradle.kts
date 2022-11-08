plugins {
    id("org.gradlex.build-parameters") version "1.3"
}

// tag::grouping[]
buildParameters {
    group("myGroup") {
        string("myString") { }
        integer("myInt") { }
    }
}
// end::grouping[]
