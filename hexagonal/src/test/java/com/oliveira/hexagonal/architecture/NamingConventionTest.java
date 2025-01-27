package com.oliveira.hexagonal.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.oliveira.hexagonal")
public class NamingConventionTest {

    @ArchTest
    public static final ArchRule consumer_reside_only_consumer_package = classes()
            .that()
            .haveNameMatching(".*Consumer")
            .should()
            .resideInAPackage("..adapters.in.consumer")
            .as("Consumer classes reside inside cosumer package in adapter.in package");

    @ArchTest
    public static final ArchRule mapper_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*Mapper")
            .should()
            .resideInAnyPackage("..adapters.in.consumer.mapper",
                    "..adapters.in.controller.mapper",
                    "..adapters.out.client.mapper",
                    "..adapters.out.repository.mapper")
            .as("Mapper classes reside inside mapper package");

    @ArchTest
    public static final ArchRule message_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*Message")
            .should()
            .resideInAnyPackage("..adapters.in.consumer.message")
            .as("Message classes reside inside message package");

    @ArchTest
    public static final ArchRule controller_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*Controller")
            .should()
            .resideInAnyPackage("..adapters.in.controller")
            .as("Controller classes reside inside controller package");

    @ArchTest
    public static final ArchRule request_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*Request")
            .should()
            .resideInAnyPackage("..adapters.in.controller.request", "..adapters.out.client.request")
            .as("Request classes reside inside request package");

    @ArchTest
    public static final ArchRule response_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*Response")
            .should()
            .resideInAnyPackage("..adapters.in.controller.response", "..adapters.out.client.response")
            .as("Response classes reside inside response package");

    @ArchTest
    public static final ArchRule adapter_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*Adapter")
            .should()
            .resideInAnyPackage("..adapters.out")
            .as("Adapter classes reside inside adapter package");

    @ArchTest
    public static final ArchRule client_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*Client")
            .should()
            .resideInAnyPackage("..adapters.out.client")
            .as("Client classes reside inside client package");

    @ArchTest
    public static final ArchRule repository_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*Repository")
            .should()
            .resideInAnyPackage("..adapters.out.repository")
            .as("Repository classes reside inside repository package");

    @ArchTest
    public static final ArchRule entity_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*Entity")
            .should()
            .resideInAnyPackage("..adapters.out.repository.entity")
            .as("Entity classes reside inside entity package");

    @ArchTest
    public static final ArchRule usecase_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*UseCase")
            .should()
            .resideInAnyPackage("..application.core.usecase")
            .as("Usecase classes reside inside usecase package");

    @ArchTest
    public static final ArchRule input_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*InputPort")
            .should()
            .resideInAnyPackage("..application.ports.in")
            .as("InputPort classes reside inside ports.in package");

    @ArchTest
    public static final ArchRule output_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*OutputPort")
            .should()
            .resideInAnyPackage("..application.ports.out")
            .as("OutputPort classes reside inside ports.out package");

    @ArchTest
    public static final ArchRule config_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*Config")
            .should()
            .resideInAnyPackage("..hexagonal.config")
            .as("Config classes reside inside config package");

    @ArchTest
    public static final ArchRule should_be_suffixed_consumer = classes()
            .that()
            .resideInAPackage("..consumer")
            .should()
            .haveSimpleNameEndingWith("Consumer");

    @ArchTest
    public static final ArchRule should_be_suffixed_mapper = classes()
            .that()
            .resideInAPackage("..mapper")
            .should()
            .haveSimpleNameEndingWith("Mapper")
            .orShould()
            .haveSimpleNameEndingWith("MapperImpl");

    @ArchTest
    public static final ArchRule should_be_suffixed_message = classes()
            .that()
            .resideInAPackage("..message")
            .should()
            .haveSimpleNameEndingWith("Message");

    @ArchTest
    public static final ArchRule should_be_suffixed_controller = classes()
            .that()
            .resideInAPackage("..controller")
            .should()
            .haveSimpleNameEndingWith("Controller");

    @ArchTest
    public static final ArchRule should_be_suffixed_request = classes()
            .that()
            .resideInAPackage("..request")
            .should()
            .haveSimpleNameEndingWith("Request");

    @ArchTest
    public static final ArchRule should_be_suffixed_response = classes()
            .that()
            .resideInAPackage("..response")
            .should()
            .haveSimpleNameEndingWith("Response");

    @ArchTest
    public static final ArchRule should_be_suffixed_client = classes()
            .that()
            .resideInAPackage("..client")
            .should()
            .haveSimpleNameEndingWith("Client");

    @ArchTest
    public static final ArchRule should_be_suffixed_repository = classes()
            .that()
            .resideInAPackage("..repository")
            .should()
            .haveSimpleNameEndingWith("Repository");

    @ArchTest
    public static final ArchRule should_be_suffixed_entity = classes()
            .that()
            .resideInAPackage("..entity")
            .should()
            .haveSimpleNameEndingWith("Entity");

    @ArchTest
    public static final ArchRule should_be_suffixed_adapter= classes()
            .that()
            .resideInAPackage("..adapters.out")
            .should()
            .haveSimpleNameEndingWith("Adapter");

    @ArchTest
    public static final ArchRule should_be_suffixed_usecase= classes()
            .that()
            .resideInAPackage("..usecase")
            .should()
            .haveSimpleNameEndingWith("UseCase");

    @ArchTest
    public static final ArchRule should_be_suffixed_input_port= classes()
            .that()
            .resideInAPackage("..ports.in")
            .should()
            .haveSimpleNameEndingWith("InputPort");

    @ArchTest
    public static final ArchRule should_be_suffixed_output_port= classes()
            .that()
            .resideInAPackage("..ports.out")
            .should()
            .haveSimpleNameEndingWith("OutputPort");

    @ArchTest
    public static final ArchRule should_be_suffixed_config= classes()
            .that()
            .resideInAPackage("..config")
            .should()
            .haveSimpleNameEndingWith("Config");



}
