package com.eco.bio7.rpreferences.template;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

import com.eco.bio7.reditor.Bio7REditorPlugin;

public class RoxygenCompletionProcessor implements IContentAssistProcessor {

	private IPreferenceStore store;

	public RoxygenCompletionProcessor() {
		store = Bio7REditorPlugin.getDefault().getPreferenceStore();
	}

	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {

		// IDocument document = viewer.getDocument();

		String[] roxygenTags = { "@aliases", "@author", "@concepts", "@describeIn", "@description", "@details",
				"@docType", "@evalRd", "@example", "@examples", "@export", "@exportClass", "@exportMethod", "@family",
				"@field", "@format", "@import", "@importClassesFrom", "@importFrom", "@importMethodsFrom", "@include",
				"@inherit", "@inheritDotParams", "@inheritParams", "@inheritSection", "@keywords", "@md", "@method",
				"@name", "@note", "@noMd", "@noRd", "@param", "@rawRd", "@rawNamespace", "@rdname", "@references",
				"@return", "@section", "@seealso", "@slot", "@source", "@template", "@templateVar", "@title", "@usage",
				"@useDynLib" };
		ICompletionProposal[] result = new ICompletionProposal[roxygenTags.length];

		for (int i = 0; i < roxygenTags.length; i++) {
			result[i] = new CompletionProposal("'" + roxygenTags[i], offset, 0, roxygenTags[i].length() + 1);
		}

		return result;

	}

	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		/*
		 * IContextInformation[] NO_CONTEXTS = new IContextInformation[1]; String text =
		 * "A title for the roxygen documentation"; NO_CONTEXTS[0] = new
		 * ContextInformation("'@Title", text);
		 */
		return null;
	}

	// add the chars for Completion here !!!

	public char[] getCompletionProposalAutoActivationCharacters() {

		if (store.getBoolean("TYPED_CODE_COMPLETION")) {
			String ac = store.getString("ACTIVATION_CHARS");
			// return "abcdefghijklmnopqrstuvwxyz".toCharArray();
			if (ac == null || ac.isEmpty()) {

				return null;
			}
			return ac.toCharArray();
		}

		return null;

	}

	// ... remaining methods are optional ...
	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		// TODO Auto-generated method stub
		return null;
	}
}