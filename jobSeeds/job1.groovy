pipelineJob("job.from.seed.1 ") {
    description("Jenkins DEMO 1 Job from ${SEED_JOB_REPO}")
    keepDependencies(false) 
    disabled(false)
    concurrentBuild(false)
    logRotator {
        numToKeep(500)
        daysToKeep(30)
    }
    definition {
        cpsScm {
            scm {
                git {
                    branch('*/master')
                    remote {
                        credentials(REPO_CRED_ID)
                        url(SEED_JOB_REPO)
                    }
                }
            }
        scriptPath('jobPipelines/job1.Jenkinsfile')
        }
    }
}
