plugins {
    id("org.gradlex.build-parameters") version "1.4.2"
}

// tag::grouping[]
buildParameters {
    group("myGroup") {
        description.set("Optional description of the group")
        string("myString")
        integer("myInt")
    }
}
// end::grouping[]
