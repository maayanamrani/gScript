# gScript
artifactory('Maayan-ohad') {
  localRepository('maven-local') {
  description "Public description"
  notes "Some internal notes"
  includesPattern "**/*" // default
  excludesPattern "" // default
  repoLayoutRef "maven-2-default"
  // xrayIndex false
  // blockXrayUnscannedArtifacts false
  // xrayMinimumBlockedSeverity "" // "Minor" | "Major" | "Critical"
  propertySets { 
  
  propertySet('property_set_name') {
    singleSelect('property_name') {
      defaultValue "value_1"
      value "value_1"
      value "value_2"
    }
    multiSelect('property_name_multi') {
      defaultValue "value_1"
      defaultValue "value_2"
      value "value_1"
      value "value_2"
    }
    anyValue('another_property_name') {
      defaultValue "value_1"
      value "value_1"
    }
  }}
  archiveBrowsingEnabled false
  blackedOut false // default
  packageType "maven" 
  
  // packageType "debian"
  // debianTrivialLayout false
  
  // packageType "docker"
  // dockerApiVersion "V2" // "V1"
  // forceDockerAuthentication false
  // maxUniqueTags 0 // optional
  
  // packageType "gradle"
  // maxUniqueSnapshots 0 // default
  // handleReleases true // default
  // handleSnapshots true // default
  // suppressPomConsistencyChecks false // default
  // snapshotVersionBehavior "unique" // "non-unique" | "deployer"
  // checksumPolicyType "client-checksums" // default | "server-generated-checksums"
  
  // packageType "ivy"
  // maxUniqueSnapshots 0 // default
  // handleReleases true // default
  // handleSnapshots true // default
  // suppressPomConsistencyChecks false // default
  // snapshotVersionBehavior "unique" // "non-unique" | "deployer"
  // checksumPolicyType "client-checksums" // default | "server-generated-checksums"
  
  // packageType "maven"
  // maxUniqueSnapshots 0 // default
  // handleReleases true // default
  // handleSnapshots true // default
  // suppressPomConsistencyChecks false // default
  // snapshotVersionBehavior "unique" // "non-unique" | "deployer"
  // checksumPolicyType "client-checksums" // default | "server-generated-checksums"
  
  // packageType "nuget"
  // maxUniqueSnapshots 0 // default
  // forceNugetAuthentication false // default
  
  // packageType "sbt"
  // maxUniqueSnapshots 0 // default
  // handleReleases true // default
  // handleSnapshots true // default
  // suppressPomConsistencyChecks false // default
  // snapshotVersionBehavior "unique" // "non-unique" | "deployer"
  // checksumPolicyType "client-checksums" // default | "server-generated-checksums"
  
  // packageType "yum"
  // yumRootDepth 0
  // groupFileNames "groups.xml"
  // calculateYumMetadata false
  
}
  
  

}
