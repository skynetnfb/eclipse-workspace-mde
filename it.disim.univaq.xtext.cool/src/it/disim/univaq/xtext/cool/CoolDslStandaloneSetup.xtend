/*
 * generated by Xtext 2.25.0
 */
package it.disim.univaq.xtext.cool


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class CoolDslStandaloneSetup extends CoolDslStandaloneSetupGenerated {

	def static void doSetup() {
		new CoolDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
