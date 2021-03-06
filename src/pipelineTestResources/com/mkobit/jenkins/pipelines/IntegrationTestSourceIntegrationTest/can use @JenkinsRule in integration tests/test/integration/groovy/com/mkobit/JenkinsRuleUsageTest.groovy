package com.mkobit

import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.jvnet.hudson.test.JenkinsRule

class JenkinsRuleUsageTest {

  @Rule
  public JenkinsRule rule = new JenkinsRule()

  @Before
  void configureRule() {
    rule.timeout = 30
  }

  @Test
  void canUseJenkins() {
    rule.createFreeStyleProject()
    Assert.assertEquals(1, rule.jenkins.allItems.size())
  }
}
