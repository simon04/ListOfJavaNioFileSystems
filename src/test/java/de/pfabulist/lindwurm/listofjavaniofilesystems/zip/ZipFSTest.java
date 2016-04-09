//package de.pfabulist.lindwurm.listofjavaniofilesystems.zip;
//
//import de.pfabulist.lindwurm.memory.MemoryFSBuilder;
//import de.pfabulist.lindwurm.niotest.tests.AllTests;
//import de.pfabulist.lindwurm.niotest.tests.FSDescription;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//
//import java.io.InputStream;
//import java.net.URI;
//import java.nio.file.FileSystem;
//import java.nio.file.FileSystems;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.Collections;
//import static de.pfabulist.lindwurm.niotest.tests.descriptionbuilders.CombinedBuilder.build;
//
///**
//* ** BEGIN LICENSE BLOCK *****
//* BSD License (2 clause)
//* Copyright (c) 2006 - 2014, Stephan Pfab
//* All rights reserved.
// *
//* Redistribution and use in source and binary forms, with or without
//* modification, are permitted provided that the following conditions are met:
//* * Redistributions of source code must retain the above copyright
//* notice, this list of conditions and the following disclaimer.
//* * Redistributions in binary form must reproduce the above copyright
//* notice, this list of conditions and the following disclaimer in the
//* documentation and/or other materials provided with the distribution.
// *
//* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
//* ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
//* WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
//* DISCLAIMED. IN NO EVENT SHALL Stephan Pfab BE LIABLE FOR ANY
//* DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
//* (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
//* LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
//* ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
//* (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
//* SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//* **** END LICENSE BLOCK ****
//*/
//
//public class ZipFSTest extends AllTests {
//
//    private static FSDescription capa;
//
//
//    private static Path zipLocation;
//    private static URI roURI;
//    private static FileSystem ro;
//
//    @BeforeClass
//    public static void setUp() throws Exception {
//        zipLocation = Files.createTempDirectory( "zipTest" ).resolve( "ro.zip" );
//        try( InputStream zip = ZipFSTest.class.getResourceAsStream( "ro.zip" )) {
//            Files.copy( zip, zipLocation );
//        }
//
//        roURI = URI.create( "jar:" + zipLocation.toUri() + "!/" );
//        ro = FileSystems.newFileSystem( roURI, Collections.EMPTY_MAP );
//        Path rofsRoot = ro.getPath( "/" ).getRoot();
//
//        Path roFile = rofsRoot.resolve( "foo" ).resolve( "baz.txt" );
//        Path roeDir  = rofsRoot.resolve( "foo" ).resolve( "bar" );
//        //Path roeDir  = createDir( rofsRoot, "c", "e" );
//
//        Path nonEmpty = rofsRoot.resolve( "foo" );
//
//        //Filess.walk( rofsRoot ).forEach( System.out::println );
//
//        Path mem = MemoryFSBuilder.unix().build( "res" ).getPath( "/" );
//        try ( InputStream is = ZipFSTest.class.getResourceAsStream( "ro.zip" )) {
//            UnzipToPath.unzipToPath( is, mem );
//        }
//
//        Filess.walk( mem ).forEach( System.out::println );
//
//
//
//        capa = build().unix().
//                next().
//                readonlyPlayground().
//                    set( rofsRoot ).
//                    nonEmptyDir( nonEmpty ).
//                    nonExisting( ro.getPath( "/fufarbup" )).
//                    file( roFile ).
//                    emptyDir( roeDir ).
//                    next().
//                closable().no().
//                symlinks().no().
//                hardlinks().no().
//                done() ;
//
//        //setPlay( ro.getPath( "play" ).toAbsolutePath() );
//    }
//
//    @AfterClass
//    public static void tearDown() throws Exception {
//
//        ro.close();
//        Files.delete( zipLocation );
//
//    }
//
//    public ZipFSTest() {
//        super( capa );
//    }
//}
