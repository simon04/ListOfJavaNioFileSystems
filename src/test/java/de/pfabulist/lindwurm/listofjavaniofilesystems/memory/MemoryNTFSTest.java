package de.pfabulist.lindwurm.listofjavaniofilesystems.memory;

import de.pfabulist.lindwurm.niotest.tests.AllTests;
import de.pfabulist.lindwurm.niotest.tests.FSDescription;
import org.junit.BeforeClass;

import java.io.IOException;

import static de.pfabulist.lindwurm.memoryntfs.MemoryNTFSBuilder.memoryNTFS;
import static de.pfabulist.lindwurm.niotest.tests.descriptionbuilders.CombinedBuilder.build;

/**
 * ** BEGIN LICENSE BLOCK *****
 * BSD License (2 clause)
 * Copyright (c) 2006 - 2015, Stephan Pfab
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL Stephan Pfab BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * **** END LICENSE BLOCK ****
 */
public class MemoryNTFSTest extends AllTests {

    private static FSDescription capa;

    @BeforeClass
    public static void beforeClass() throws IOException {

        capa = build().
                windows().next().
                playground().set( memoryNTFS().name("ttt").drives().build().getPath( "C:\\foo" )).
                //closeable().playground( memoryFS().closable( true ).watchService(true).build("memoryntfsTestClosable2").getPath("/play")).yes().
                closable().no().
                fileChannel().no().
                watchable().no().
                //readOnly().no().
                //symlinks().no().
                bug( "testReadAttributesViewFutureExistingFile" ).
                bug( "testMoveSymLinkDoesNotChangeLastModifiedTime" ).
                bug( "testOverwriteDoesNotSetLastAccessTimeOfParent" ).
                bug( "testReadFileDoesNotSetParentsLastAccessTime" ).
                bug( "testReadDirStreamDoesNotSetParentsLastAccessTime").
                done();


    }


    public MemoryNTFSTest() {
        super(capa);
    }

}
