def call(Map params) {
    def prefix = "<mySharedFunction>"

/**
params:
    first
    second
    third
*/
    echo "${prefix} > start"
    echo "${prefix} 1st param: ${params.first}"
    echo "${prefix} 2nd param: ${params.second}"
    echo "${prefix} 3rd param: ${params.third}"
    echo "${prefix} < end"
}